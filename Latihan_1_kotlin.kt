//LATIHAN 1📍
fun main() {
    val score = 95
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        score >= 60 -> "D"
        else -> "E"
    }
    println("Grade Anda: $grade")
}

// LATIHAN 2📍
fun main() {
    val item1 = 12000
    val item2 = 8500
    val item3 = 20000
    val totalBelanja = item1 + item2 + item3
    println("Total belanja: Rp$totalBelanja")
}

// LATIHAN 3📍
fun main() {
    val numbers = listOf(2, 7, 10, 13, 18, 21)
    println("Angka genap:")
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}

// LATIHAN 4📍
fun main() {
    val names = listOf("Ana", "Bambang", "Christina", "Dewi")
    var longestName = ""
    for (name in names) {
        if (name.length > longestName.length) {
            longestName = name
        }
    }
    println("Nama dengan karakter terbanyak: $longestName")
}

// LATIHAN 5📍
fun main() {
    val stok = listOf(10, 5, 20, 7, 12)
    val totalStok = stok.sum()
    println("Total seluruh barang di gudang: $totalStok")
}

// LATIHAN 6📍
fun main() {
    // Data survei siswa dengan format Map<String, List<Int>>
    // List berisi skor untuk: Kebersihan, Fasilitas, Pelayanan, Administrasi, Keamanan
    val surveyData = mapOf(
        "A" to listOf(4, 5, 3, 4, 5),
        "B" to listOf(5, 4, 4, 5, 4),
        "C" to listOf(3, 2, 2, 3, 3),
        "D" to listOf(5, 5, 5, 4, 5),
        "E" to listOf(2, 3, 1, 2, 2),
        "F" to listOf(4, 4, 3, 4, 4),
        "G" to listOf(3, 3, 2, 3, 3),
        "H" to listOf(5, 4, 4, 5, 5)
    )
    
    val categories = listOf("Kebersihan", "Fasilitas", "Pelayanan", "Administrasi", "Keamanan")
    
    println("=== HASIL SURVEI KEPUASAN SISWA ===\n")
    
    // 1. Hitung rata-rata skor setiap siswa dan tampilkan status
    println("1. RATA-RATA SKOR DAN STATUS SETIAP SISWA:")
    println("-".repeat(50))
    
    val studentAverages = mutableMapOf<String, Double>()
    
    surveyData.forEach { (name, scores) ->
        val average = scores.average()
        studentAverages[name] = average
        
        val status = when {
            average >= 4.0 -> "Sangat Puas"
            average >= 3.0 -> "Puas"
            else -> "Tidak Puas"
        }
        
        println("$name: ${String.format("%.2f", average)} - $status")
    }
    
    // 2. Tampilkan siswa dengan rata-rata tertinggi
    println("\n2. SISWA DENGAN RATA-RATA TERTINGGI:")
    println("-".repeat(50))
    
    val highestAverage = studentAverages.maxByOrNull { it.value }
    if (highestAverage != null) {
        println("${highestAverage.key}: ${String.format("%.2f", highestAverage.value)}")
    }
    
    // 3. Hitung rata-rata tiap kategori dari seluruh siswa
    println("\n3. RATA-RATA SETIAP KATEGORI:")
    println("-".repeat(50))
    
    for (i in categories.indices) {
        val categoryScores = surveyData.values.map { it[i] }
        val categoryAverage = categoryScores.average()
        println("${categories[i]}: ${String.format("%.2f", categoryAverage)}")
    }
    
    // 4. Tampilkan siswa yang memberikan skor di bawah 3 pada kategori "Pelayanan"
    println("\n4. SISWA DENGAN SKOR PELAYANAN < 3:")
    println("-".repeat(50))
    
    val pelayananIndex = 2 // Index untuk kategori "Pelayanan"
    val lowServiceStudents = surveyData.filter { (_, scores) ->
        scores[pelayananIndex] < 3
    }
    
    if (lowServiceStudents.isNotEmpty()) {
        lowServiceStudents.forEach { (name, scores) ->
            println("$name: Skor Pelayanan = ${scores[pelayananIndex]}")
        }
    } else {
        println("Tidak ada siswa yang memberikan skor pelayanan di bawah 3")
    }
}

// LATIHAN 7📍
fun main() {
    data class Peminjaman(val namaSiswa: String, val bukuDipinjam: List<String>, val sudahDikembalikan: Boolean)

    val peminjamanData = listOf(
        Peminjaman("Siswa A", listOf("Kotlin Dasar", "Java Lanjutan"), false),
        Peminjaman("Siswa B", listOf("Pengantar Algoritma"), true),
        Peminjaman("Siswa C", listOf("Kotlin Dasar", "Struktur Data"), false),
        Peminjaman("Siswa D", listOf("Jaringan Komputer"), true),
        Peminjaman("Siswa E", listOf("Kotlin Lanjutan", "Kotlin Dasar", "Sistem Operasi"), false)
    )

    // Tugas 2
    println("Siswa yang belum mengembalikan buku:")
    peminjamanData.filter { !it.sudahDikembalikan }.forEach { println(it.namaSiswa) }

    println("\n----------------------------------\n")

    // Tugas 3
    println("Judul buku unik yang pernah dipinjam:")
    val uniqueBooks = peminjamanData.flatMap { it.bukuDipinjam }.toSet()
    uniqueBooks.forEach { println(it) }

    println("\n----------------------------------\n")

    // Tugas 4
    println("Siswa yang meminjam lebih dari 2 buku:")
    peminjamanData.filter { it.bukuDipinjam.size > 2 }.forEach { println(it.namaSiswa) }

    println("\n----------------------------------\n")

    // Tugas 5
    println("Siswa yang meminjam buku berjudul 'Kotlin Dasar':")
    peminjamanData.filter { it.bukuDipinjam.any { buku -> buku.equals("Kotlin Dasar", ignoreCase = true) } }
        .forEach { println(it.namaSiswa) }

    println("\n----------------------------------\n")

    // Tugas 6
    val totalBukuDipinjam = peminjamanData.sumOf { it.bukuDipinjam.size }
    println("Total seluruh buku yang dipinjam: $totalBukuDipinjam")
}

// LATIHAN 8📍
fun main() {
    val kehadiran = mapOf(
        "Siswa A" to listOf(true, true, true, false, true, true, true, false),
        "Siswa B" to listOf(true, true, true, true, true, true, true, true),
        "Siswa C" to listOf(true, false, true, false, true, false, true, false),
        "Siswa D" to listOf(true, true, true, true, true, true, true, true),
        "Siswa E" to listOf(false, false, false, false, false, false, false, false),
        "Siswa F" to listOf(true, true, true, true, true, true, true, true),
        "Siswa G" to listOf(true, true, true, true, false, true, true, true),
        "Siswa H" to listOf(true, true, true, true, true, true, true, true),
        "Siswa I" to listOf(true, true, false, true, true, false, true, true),
        "Siswa J" to listOf(false, true, true, true, false, true, true, false)
    )

    // Tugas 1
    println("Jumlah kehadiran tiap siswa:")
    kehadiran.forEach { (siswa, listKehadiran) ->
        val hadirCount = listKehadiran.count { it }
        println("$siswa: $hadirCount kali")
    }

    println("\n----------------------------------\n")

    // Tugas 2
    println("Siswa yang tidak memenuhi syarat minimal 6 kali hadir:")
    kehadiran.filterValues { it.count { hadir -> hadir } < 6 }.keys.forEach { println(it) }

    println("\n----------------------------------\n")

    // Tugas 3
    val tertinggi = kehadiran.maxByOrNull { it.value.count { hadir -> hadir } }
    val terendah = kehadiran.minByOrNull { it.value.count { hadir -> hadir } }
    println("Siswa dengan kehadiran tertinggi: ${tertinggi?.key} (${tertinggi?.value?.count { it }} kali)")
    println("Siswa dengan kehadiran terendah: ${terendah?.key} (${terendah?.value?.count { it }} kali)")

    println("\n----------------------------------\n")

    // Tugas 4
    val totalKehadiran = kehadiran.values.sumOf { it.count { hadir -> hadir } }
    val totalPertemuan = 8 * kehadiran.size
    val persentaseRataRata = (totalKehadiran.toDouble() / totalPertemuan) * 100
    println("Persentase rata-rata kehadiran kelas: %.2f%%".format(persentaseRataRata))

    println("\n----------------------------------\n")

    // Tugas 5
    println("Siswa dengan persentase kehadiran di bawah 75%:")
    kehadiran.forEach { (siswa, listKehadiran) ->
        val persentaseSiswa = (listKehadiran.count { it }.toDouble() / 8) * 100
        if (persentaseSiswa < 75) {
            println("$siswa: Tidak layak ikut ujian (Persentase: %.2f%%)".format(persentaseSiswa))
        }
    }
}

// LATIHAN 9📍
fun main() {
    data class Pemesanan(
        val namaSiswa: String,
        val hariBooking: String,
        val jamBooking: String,
        val namaLab: String,
        val statusDisetujui: Boolean
    )

    val pemesananData = listOf(
        Pemesanan("Siswa A", "Senin", "08.00–10.00", "Lab AI", true),
        Pemesanan("Siswa B", "Selasa", "10.00–12.00", "Lab Jaringan", false),
        Pemesanan("Siswa A", "Rabu", "08.00–10.00", "Lab AI", false),
        Pemesanan("Siswa C", "Kamis", "13.00–15.00", "Lab AI", true),
        Pemesanan("Siswa D", "Jumat", "09.00–11.00", "Lab Multimedia", true),
        Pemesanan("Siswa E", "Jumat", "10.00–12.00", "Lab Jaringan", true)
    )

    // Tugas 2
    println("Pemesanan yang belum disetujui:")
    pemesananData.filter { !it.statusDisetujui }.forEach {
        println("Nama: ${it.namaSiswa}, Hari: ${it.hariBooking}, Jam: ${it.jamBooking}, Lab: ${it.namaLab}")
    }

    println("\n----------------------------------\n")

    // Tugas 3
    println("Total pemesanan per laboratorium:")
    pemesananData.groupingBy { it.namaLab }.eachCount().forEach { (lab, count) ->
        println("$lab: $count pemesanan")
    }

    println("\n----------------------------------\n")

    // Tugas 4
    println("Daftar siswa yang memesan pada hari Jumat:")
    pemesananData.filter { it.hariBooking == "Jumat" }.map { it.namaSiswa }.toSet().forEach { println(it) }

    println("\n----------------------------------\n")

    // Tugas 5
    fun isRoomUsed(labName: String, day: String, time: String): Boolean {
        return pemesananData.any { it.namaLab == labName && it.hariBooking == day && it.jamBooking == time && it.statusDisetujui }
    }
    println("Apakah 'Lab AI' sudah digunakan pada hari Kamis jam '08.00–10.00'? ${isRoomUsed("Lab AI", "Kamis", "08.00–10.00")}")

    println("\n----------------------------------\n")

    // Tugas 6
    println("Siswa yang memesan lebih dari satu kali:")
    pemesananData.groupingBy { it.namaSiswa }.eachCount().filterValues { it > 1 }.keys.forEach { println(it) }
}

// LATIHAN 10📍
fun main() {
    val pilihanBahasa = mapOf(
        "Siswa A" to listOf("Kotlin", "Python", "Java"),
        "Siswa B" to listOf("Java", "C++", "C#"),
        "Siswa C" to listOf("Kotlin", "Java", "Python"),
        "Siswa D" to listOf("Python", "C", "C#"),
        "Siswa E" to listOf("C++", "C", "Java"),
    )

    // Tugas 1
    println("Semua bahasa pemrograman yang pernah dipilih:")
    val allLanguages = pilihanBahasa.values.flatten().toSet()
    allLanguages.forEach { println(it) }

    println("\n----------------------------------\n")

    // Tugas 2
    println("Jumlah pemilih setiap bahasa, diurutkan dari yang paling banyak:")
    val languageCounts = pilihanBahasa.values.flatten().groupingBy { it }.eachCount()
    languageCounts.entries.sortedByDescending { it.value }.forEach { (lang, count) ->
        println("$lang: $count pemilih")
    }

    println("\n----------------------------------\n")

    // Tugas 3
    println("Siswa yang memilih 'Kotlin' sebagai pilihan pertama:")
    pilihanBahasa.filter { it.value.firstOrNull() == "Kotlin" }.keys.forEach { println(it) }

    println("\n----------------------------------\n")

    // Tugas 4
    val pythonChoosers = pilihanBahasa.count { it.value.contains("Python") }
    println("Jumlah siswa yang memilih 'Python': $pythonChoosers")

    println("\n----------------------------------\n")

    // Tugas 5
    val allPossibleLanguages = listOf("Kotlin", "Java", "C++", "Python", "C", "C#")
    val chosenLanguages = pilihanBahasa.values.flatten().toSet()
    val unchosenLanguages = allPossibleLanguages.filter { it !in chosenLanguages }
    println("Bahasa yang tidak dipilih sama sekali: $unchosenLanguages")
}
