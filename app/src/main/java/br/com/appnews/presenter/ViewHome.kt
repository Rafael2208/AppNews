package br.com.appnews.presenter

import android.os.Message
import br.com.appnews.model.Article

class ViewHome {
    interface View {
        fun showProgressBar()
        fun showFailure(message: String)
        fun hidProgressBar()
        fun showArticles(articles:List<Article>)
    }
}