package br.com.appnews.presenter.search

import br.com.appnews.model.NewsResponse

interface SearchHome {
    interface Presenter {
        fun search(term: String)
        fun onSuccess(newsResponse: NewsResponse)
        fun onError(message: String)
        fun onComplete()
    }
}