import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.GULMATICO.CHRISTIANLLOYD.BLOCK1.p1.quiz.R

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
    }


    fun onLoginClick(view: android.view.View) {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()


        if (username.isNotEmpty() && password.isNotEmpty()) {

            showToast("Login successful")
        } else {
            showToast("Please enter both username and password")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}