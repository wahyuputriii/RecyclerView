package com.example.recyclerview

object RecipeData {
    private val data = arrayOf(
        arrayOf(
            "Bakso Sapi Enak",
            "300 gr daging sapi giling\n" +
                    "garam secukupnya\n" +
                    "lada putih bubuk secukupnya\n" +
                    "2 siung bawang putih\n" +
                    "2 sdm tepung kanji\n" +
                    "1 butir putih telur\n" +
                    "bumbu kuah bakso\n" +
                    "8 liter air\n" +
                    "3 kg tulang kaki sapi\n" +
                    "bumbu halus\n" +
                    "16 siung bawang merah\n" +
                    "8 siung bawang putih\n" +
                    "16 butir kemiri\n" +
                    "1 sdm lada putih bubuk\n" +
                    "5 sdm minyak goreng\n" +
                    "Cara memasak:\n" +
                    "Ambil 2 buah sendok makan daging sapi\n" +
                    "\n" +
                    "Ambil adonan menggunakan 1 sendok makan, sementara sendok lainnya untuk membentuk adonan menjadi bulat.\n" +
                    "\n" +
                    "Selain menggunakan sendok, anda juga bisa menggunakan tangan untuk membuat pentol bakso sapi. Jangan lupa beri sedikit minyak goreng pada telapak tangan agar tidak lengket.\n" +
                    "\n" +
                    "ebus segera pentol yang telah kita buat tadi dalam air mendidih selama - 10 - 15 menit. atau sampai dilihat pentol sudah mengapung. Ini pertanda bahwa pentol bakso sapi sudah matang\n" +
                    "\n" +
                    "Angkat dan tiriskan\n" +
                    "\n" +
                    "Siapkan wajan, panaskan minyak. Tumis bumbu halus hingga matang dan harum, angkat.\n" +
                    "\n" +
                    "Siapkan panci, masukkan tulang kaki sapi/ tulang sumsum sapi dan bumbu tumis. Rebus hingga air mendidih dan kuah harum.\n" +
                    "\n" +
                    "Sajikan bakso bersama pelengkap mie lalu siram kuah bakso,hidangkan bersama Kecap Manis Bango, bakso pun siap disantap selagi hangat.",
            "https://cdn0-production-images-kly.akamaized.net/VTDiAj5ffuLCm1CEjR9VExObwkQ=/1200x675/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2763419/original/071857300_1553761217-shutterstock_1148354906.jpg"
        ),
        arrayOf(
            "Brokoli Cah Sapi",
            "1 buah brokoli potong perkuntum, siram air panas\n" +
                    "1 lembar kubis iris tipis\n" +
                    "50 gr tauge\n" +
                    "saus\n" +
                    "100 gr fillet Ayam, iris tipis\n" +
                    "3 butir bakso sapi, iris bulat\n" +
                    "1 siung bawang putih\n" +
                    "2 sdm saus tiram\n" +
                    "2 sdm kecap manis\n" +
                    "1 sdt tepung maizena\n" +
                    "garam\n" +
                    "lada putih bubuk\n" +
                    "minyak goreng\n" +
                    "air\n"+
                    "Cara memasak:\n" +
                    "Tumis bawang putih dan daging sapi sampai berubah warna, tambahkan air, kecap manis Bango, minyak wijen, saos tiram, garam, dan lada putih bubuk.\n" +
                    "\n" +
                    "Masak sampai daging sapi empuk, masukkan brokoli, aduk-aduk sampai brokoli matang, kentalkan dengan tepung maizena.\n" +
                    "\n" +
                    "sajikan dengan hangat\n" +
                    "https://kontroversinews.com/wp-content/uploads/2021/04/images_daging_tumis-daging-brokoli.jpg"
        )
    )
    val listData: ArrayList<Recipe>
        get() {
            val list = arrayListOf<Recipe>()
            for (aData in data) {
                val Recipe = Recipe()
                Recipe.name = aData[0]
                Recipe.from = aData[1]
                Recipe.photo = aData[2]
                list.add(Recipe)
            }
            return list
        }
}