package repository

import api.RetrofitInstance
import db.ArticleDataBase

class NewsRepository(
    val db: ArticleDataBase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBrakingNews(countryCode, pageNumber)
}