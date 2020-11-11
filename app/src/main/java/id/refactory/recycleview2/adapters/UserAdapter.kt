package id.refactory.recycleview2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.refactory.recycleview2.databinding.ItemUserBinding
import id.refactory.recycleview2.models.UserModel

class UserAdapter(private val context: Context) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {


    private var users = listOf<UserModel>()
    fun setData(list: List<UserModel>) {
        users = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(userModel: UserModel) {
            binding.run {
                tvId.text = userModel.id.toString()
                tvName.text = userModel.name
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemUserBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(users[position])

    }

    override fun getItemCount(): Int = users.size
}