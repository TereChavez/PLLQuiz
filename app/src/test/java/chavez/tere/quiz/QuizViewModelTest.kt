package chavez.tere.quiz

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Test

class QuizViewModelTest {
    @Test
    fun providesExpectedQuestionText() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_pll, quizViewModel.currentQuestionText)

    }
        @Test
        fun wrapsAroundQuestionBank() {
            val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 9))
            val quizViewModel = QuizViewModel(savedStateHandle)
            assertEquals(R.string.question_ce, quizViewModel.currentQuestionText)
            quizViewModel.moveToNext()
            assertEquals(R.string.question_pll, quizViewModel.currentQuestionText)
        }
    }

