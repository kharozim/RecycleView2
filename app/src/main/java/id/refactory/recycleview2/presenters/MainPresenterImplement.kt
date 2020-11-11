package id.refactory.recycleview2.presenters

import id.refactory.recycleview2.models.UserModel
import id.refactory.recycleview2.views.MainView

class MainPresenterImplement(val view: MainView) : MainPresenter {
    override fun getAllUser() {
        val users: List<UserModel> = (1..20).toList().map { UserModel(it, "$it") }
        view.onSuccessGetAllUser(users)

    }


}