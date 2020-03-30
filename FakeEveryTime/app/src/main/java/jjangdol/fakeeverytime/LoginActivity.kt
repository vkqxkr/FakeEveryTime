package jjangdol.fakeeverytime

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class  LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 상태바 회색 아이콘 색상을 설정
        val view = window.decorView
        view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        setContentView(R.layout.activity_login)

        textView_search.setOnClickListener {
            val goSearchInfoActivity = Intent(this, SearchInfoActivity::class.java)
            startActivity(goSearchInfoActivity)
            overridePendingTransition(R.anim.sliding_up, R.anim.stay)
        }

        textView_signup.setOnClickListener {
            val goSignUpActivity = Intent(this, SignUpActivity::class.java)
            startActivity(goSignUpActivity)
            overridePendingTransition(R.anim.sliding_up, R.anim.stay)
        }

        textView_facebook.setOnClickListener {
            val goFacebookActivity = Intent(this, FacebookActivity::class.java)
            startActivity(goFacebookActivity)
            overridePendingTransition(R.anim.sliding_up, R.anim.stay)
        }
    }
}
