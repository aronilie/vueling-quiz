package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(1, "What country does this flag belong to?",
            R.drawable.albania,
            "Afghanistan", "Liberia", "Albania", "Slovakia",
            3
        )

        questionsList.add(question1)

        val question2 = Question(2, "In which country is the kuna currency used?",
            R.drawable.kuna,
            "Ecuador", "Croatia", "Serbia", "Lithuania",
            2
        )

        questionsList.add(question2)

        val question3 = Question(3, "Which of the following countries has the most population?",
            R.drawable.population,
            "India", "Japan", "China", "Indonesia",
            3
        )

        questionsList.add(question3)

        val question4 = Question(4, "In which country is the monument 'Cristo Redentor' located?",
            R.drawable.monument,
            "Bolivia", "Ecuador", "Colombia", "Brazil",
            4
        )

        questionsList.add(question4)

        val question5 = Question(5, "In which country can you fly with Vueling from Spain?",
            R.drawable.flight,
            "Senegal", "Lebanon", "Tunisia", "All the answers are correct",
            4
        )

        questionsList.add(question5)

        return questionsList
    }
}