package com.example.mvppattern

import android.os.Handler
import java.util.*

class Model:Contract.Model {

    private val arrayList =
        Arrays.asList(
            " The Model View Presenter pattern is an architectural pattern based on the Model View Controller (MVC) pattern " +
                    "that increases the separation of concerns and facilitates unit testing. \n " +
                    "It creates three layers, Model, View, and Presenter, each with a well defined responsibility.",
            "Model: Layer for storing data. \n " +
                    "It is responsible for handling the domain logic(real-world business rules) and communication with" +
                    " the database and network layers.",
            "View: UI(User Interface) layer.\n" +
                    " It provides the visualization of the data and keep a track of the user’s action in order to notify the Presenter.",
            "Presenter: Fetch the data from the model and applies the UI logic to decide what to display."
        )

    // this method will invoke when
    // user clicks on the button
    // and it will take a delay of
    // 1200 milliseconds to display next course detail

    override fun getNextCourse(onFinishedListener: Contract.Model.OnFinishedListener?) {

        Handler().postDelayed({ onFinishedListener!!.onFinished(getRandomString) }, 600)
    }

    // method to select random
    // string from the list of strings
    private val getRandomString: String
        private get() {
            val random = Random()
            val index = random.nextInt(arrayList.size)
            return arrayList[index]
        }
}