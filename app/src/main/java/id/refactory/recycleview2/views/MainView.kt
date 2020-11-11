package id.refactory.recycleview2.views

import id.refactory.recycleview2.models.UserModel

interface MainView {
    fun onSuccessGetAllUser(users : List<UserModel>)
}