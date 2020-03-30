package jjangdol.fakeeverytime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SearchInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 상태바 회색 아이콘 색상을 설정
        val view = window.decorView
        view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        setContentView(R.layout.activity_search_info)
    }
}
