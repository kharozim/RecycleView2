package id.refactory.recycleview2.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.refactory.recycleview2.adapters.UserAdapter
import id.refactory.recycleview2.databinding.ActivityMainBinding
import id.refactory.recycleview2.models.UserModel
import id.refactory.recycleview2.presenters.MainPresenter
import id.refactory.recycleview2.presenters.MainPresenterImplement

class MainActivity : AppCompatActivity(), MainView {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val presenter by lazy { MainPresenterImplement(this) }
    private val adapter by lazy { UserAdapter(this) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        presenter.getAllUser()

    }
    override fun onSuccessGetAllUser(users: List<UserModel>) {
        adapter.setData(users)
    }
}