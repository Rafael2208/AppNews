package br.com.appnews.presenter.news

import android.os.Message
import br.com.appnews.model.NewsResponse

class NewsHome {
    interface Presenter {
        fun requestAll()
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }
}