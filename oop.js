// COMPOSITION
console.log("=== Composition ===");

class Engine {
  start() {
    console.log("Mesin dinyalakan");
  }
}

class Car {
  constructor() {
    this.engine = new Engine();
  }
  drive() {
    this.engine.start();
    console.log("Mobil berjalan");
  }
}

let car = new Car();
car.drive();

// POLYMORPHISM
console.log("=== Polymorphism ===");

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

// ABSTRACTION
console.log("=== Abstraction ===");

class Animal {
  constructor() {
    if (new.target === Animal) {
      throw new Error("Tidak bisa membuat instance dari class abstract");
    };
  }

  makeSound() {
    throw new Error("Method 'makeSound()' harus di override");
  }
}

class Dog extends Animal {
  makeSound() {
    console.log("Woof Woof");
  }
}

class Cat extends Animal {
  makeSound() {
    console.log("Meow Meow");
  }
}

let d = new Dog();
console.log(d.makeSound());

// let a = new Animal(); // Error

// STATIC
console.log("=== Static ===");

class Matematika {
  static pi = 3.14159;

  static luasLingkaran(jari) {
    return this.pi * jari * jari;
  }
}

console.log(Matematika.luasLingkaran(7));

// GETTER & SETTER
console.log("=== Getter & Setter ===");

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