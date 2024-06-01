package com.example.lab6

import java.sql.Date
import kotlin.time.Duration

data class Movie(
    val title: String,
    val year: String,
    val posterURL: String,
    val duration: String,
    val releaseDate: String,
    val genre : String,
    val shotDescription : String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie(
                "Kungfu pannda",
                "2024",
                "https://cloudcdnvod.tek4tv.vn/Mam/attach/upload/29022024144444/144441_4__khung_tron_phai.jpg",
                "120",
                "10/5/2024",
                "Action",
                "Kungfu Panda"
            ), Movie(
                "Dune: Hành tinh cát - Phần 2",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/p/o/poster_dune_2_bb_3_no_qr_1_.jpg",
                "130",
                "15/5/2024",
                "Action",
                "Kungfu Panda"
            ), Movie(
                "Thanh gươm diệt quỷ - Phần 3",
                "2024",
                "https://upload.wikimedia.org/wikipedia/vi/thumb/9/93/Thanh_g%C6%B0%C6%A1m_di%E1%BB%87t_qu%E1%BB%B7_m%C3%B9a_3.jpeg/220px-Thanh_g%C6%B0%C6%A1m_di%E1%BB%87t_qu%E1%BB%B7_m%C3%B9a_3.jpeg",
                "70",
                "12/5/2024",
                "Action",
                "Kungfu Panda"
            ), Movie(
                "Kong x Godzilla: Đế chế mới",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/1800x/71252117777b696995f01934522c402d/p/o/poster_payoff_godzilla_va_kong_3_1_.jpg",
                "110",
                "10/5/2024",
                "Action",
                "Kungfu Panda"
            ), Movie(
                "Kong x Godzilla: Đế chế mới",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/1800x/71252117777b696995f01934522c402d/p/o/poster_payoff_godzilla_va_kong_3_1_.jpg",
                "110",
                "10/5/2024",
                "Action",
                "Kungfu Panda"
            ), Movie(
                "Kong x Godzilla: Đế chế mới",
                "2024",
                "https://iguov8nhvyobj.vcdn.cloud/media/catalog/product/cache/1/image/1800x/71252117777b696995f01934522c402d/p/o/poster_payoff_godzilla_va_kong_3_1_.jpg",
                "110",
                "10/5/2024",
                "Action",
                "Kungfu Panda"
            )
        )
    }
}
