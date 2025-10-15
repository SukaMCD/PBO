// -------------|
// POLYMORPHISM |
// -------------|

class Burung {
  bersuara() {
    console.log("Cuit Cuit");
  }
}

class Ayam extends Burung {
  bersuara() {
    console.log("Kukuruyuk");
  }
}

class Bebek extends Burung {
  bersuara() {
    console.log("Kwek Kwek");
  }
}

const DaftarBurung = [new Ayam(), new Bebek()];

DaftarBurung.forEach((burung) => burung.bersuara());

// -------|
// STATIC |
// -------|

class Matematika {
  static pi = 3.14159;

  static luasLingkaran(jari) {
    return this.pi * jari * jari;
  }
}

console.log(Matematika.luasLingkaran(7));

// ----------------|
// GETTER & SETTER |
// ----------------|

class Mahasiswa {
    #nama;

    constructor (nama) {
        this.#nama = nama;
    }

    get nama() {
        return this.#nama.toUpperCase();
    }

    set nama (value) {
        if (value.length < 3) {
            console.log("Nama Terlalu pendek");
            return;
        }
    this.#nama = value;
    }
}

const mhs = new Mahasiswa("Ari");

console.log(mhs.nama);

mhs.nama = "Li"
mhs.nama = "Putri"
console.log(mhs.nama);