package functions

import com.kttdevelopment.mal4j.MyAnimeList
import com.kttdevelopment.mal4j.manga.MangaPreview

val mal: MyAnimeList = MyAnimeList.withClientID("b36aefa585236f53ad912e313671a244")


fun test(args: Array<String>) {


    val askManga = mal.manga.withQuery("demon slayer").search()

    returnAsked(askManga)
    print(getVolumesFromAsked(askManga[0]))

}

fun getVolumesFromAsked(manga : MangaPreview): Int? {
    return manga.volumes
}

/*Donne la liste des mangas avec le bon nom*/
fun returnAsked(title : MutableList<MangaPreview>) {
    for (i in title.indices) {
        if (verifGoodName(title[0].title,title[i].title)) {
            println(title[i].title)
        }
    }
}
fun verifGoodName(title1 : String, title2 : String) : Boolean {
    var size = 0
    if (title1.length < title2.length) {
        size = title1.length
    } else {
        size = title2.length
    }
    for (i in 0 until size) {
        if(title2.contains(title1.subSequence(0,5))) {
            return true
        }
    }
    return false
}