package jjangdol.fakeeverytime

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_login.*

class  LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //상태바 투명 및 상태바 아이콘을 어둡게 설정
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = 0x00000000  // transparent
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val flags = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
            window.addFlags(flags)
        }
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

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
