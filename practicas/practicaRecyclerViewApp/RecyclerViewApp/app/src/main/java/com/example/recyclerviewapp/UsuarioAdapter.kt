package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.adapter.UsuarioViewHolder

class UsuarioAdapter(var items: ArrayList<Usuario>) : RecyclerView.Adapter<UsuarioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_usuario, parent, false)
        return UsuarioViewHolder(view)
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val user = items[position]
        holder.bind(
            user,
            onDeleteClick = { pos -> removeUser(pos) },
            onEditClick = { usuario, pos -> editUser(usuario, pos, holder) }
        )
    }

    override fun getItemCount(): Int = items.size

    fun addUser(user: Usuario) {
        items.add(user)
        notifyItemInserted(getItemCount() - 1)
    }

    fun removeUser(position: Int) {
        if (position in items.indices) {
            items.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    fun editUser(usuario: Usuario, position: Int, holder: UsuarioViewHolder) {
        val context = holder.itemView.context
        val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_edit_usuario, null)

        val editNombre = dialogView.findViewById<EditText>(R.id.editNombre)
        val editEdad = dialogView.findViewById<EditText>(R.id.editEdad)
        val editCorreo = dialogView.findViewById<EditText>(R.id.editCorreo)

        // Cargar valores actuales
        editNombre.setText(usuario.nombre)
        editEdad.setText(usuario.edad.toString())
        editCorreo.setText(usuario.email)

        AlertDialog.Builder(context)
            .setTitle("Editar usuario")
            .setView(dialogView)
            .setPositiveButton("Guardar") { _, _ ->
                usuario.nombre = editNombre.text.toString()
                usuario.edad = editEdad.text.toString().toIntOrNull() ?: usuario.edad
                usuario.email = editCorreo.text.toString()

                notifyItemChanged(position) // 🔄 actualiza solo ese item
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }
}
