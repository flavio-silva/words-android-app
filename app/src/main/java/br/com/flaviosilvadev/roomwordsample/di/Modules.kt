package br.com.flaviosilvadev.roomwordsample.di

import androidx.room.Room
import br.com.flaviosilvadev.roomwordsample.WordListAdapter
import br.com.flaviosilvadev.roomwordsample.WordViewModel
import br.com.flaviosilvadev.roomwordsample.dao.WordRoomDatabase
import br.com.flaviosilvadev.roomwordsample.repository.WordRepository
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoryModule = module {
    single {
        WordRepository(get())
    }
}
val dbModule = module {
    single {
        Room.databaseBuilder(
            get(),
            WordRoomDatabase::class.java,
            "Word_database"
    )   .build() }

    single { get<WordRoomDatabase>().wordDao() }
}

val uiModule = module {
    single {
        WordListAdapter(get())
    }
}

val viewModelModule = module {

    viewModel {
        WordViewModel(get(), get())
    }
}