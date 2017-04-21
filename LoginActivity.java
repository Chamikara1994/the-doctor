package rapticon.com.thedoctor;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    // UI references.
    private AutoCompleteTextView userName;
    private EditText userPassword;
    private Button signInButton;

    private Button registerButton;
    private Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        mActivity = this;
        userName = (AutoCompleteTextView) findViewById(R.id.email);
        userPassword = (EditText) findViewById(R.id.password);
        signInButton = (Button) findViewById(R.id.signInButton);

        registerButton = (Button) findViewById(R.id.register);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mActivity, MainMenu.class);
                startActivity(intent);

            }
        });


    }

}

