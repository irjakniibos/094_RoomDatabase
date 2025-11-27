package com.example.a20230140094_roomdatabase.viewmodel.provider

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a20230140094_roomdatabase.viewmodel.EntryViewModel
import com.example.a20230140094_roomdatabase.viewmodel.HomeViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek Application dan mengembalikan sebuah instance dari
 * AplikasiSiswa
 */

