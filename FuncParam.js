//Function dengan parameter
// function greet(name) {
//     console.log("Hello, " + name + "!");
// }

// greet("Alice");
// greet("Bob");

//Function dengan return
// function add(a, b) {
//     return a + b;
// }

// let sum = add(5, 10);
// console.log("The sum is: " + sum);

// let car = {
//     name: "Flat",
//     model: 500,
//     weight: "850kg",
//     color: "white",

//     start: function() {
//         console.log("Mobil dinyalakan");
//     },
//     drive: function() {
//         console.log("Mobil berjalan");
//     },
//     brake: function() {
//         console.log("Mobil mengerem");
//     },
//     stop: function() {
//         console.log("Mobil berhenti");
//     }
// };

// console.log(car.name);
// console.log(car.color);
// car.start();
// car.drive();

//Latihan
// let sepeda = {
//     merk: "Polygon",
//     warna: "Merah",
//     jumlah_gear: "7",

//     start : function() {
//         console.log("Sepeda mulai dikayuh");
//     },
//     brake : function() {
//         console.log("Sepeda mengerem");
//     },
// };

// console.log(sepeda.merk);
// console.log(sepeda.warna);
// sepeda.start();
// sepeda.brake();

//func
// function car(name, model, weight, color) {
//     this.name = name;
//     this.model = model;
//     this.weight = weight;
//     this.color = color;

//     this.start = function() {
//         console.log(`${this.name} dinyalakan`);
//     };
//     this.drive = function() {
//         console.log(`${this.name} berjalan`);
//     };
// }

// let car1 = new car("Toyota", "Corolla", "1300kg", "blue");
// let car2 = new car("Honda", "Civic", "1200kg", "red");

// car1.start();
// car2.drive();

// class Car {
//     constructor(name, model, weight, color) {
//         this.name = name;
//         this.model = model;
//         this.weight = weight;
//         this.color = color;
//     }

//     start() {
//         console.log(`${this.name} dinyalakan`);
//     }

//     drive() {
//         console.log(`${this.name} berjalan`);
//     }

//     brake() {
//         console.log(`${this.name} mengerem`);
//     }

//     stop() {
//         console.log(`${this.name} berhenti`);
//     }
// }
// let car1 = new Car("Toyota", "Corolla", "1300kg", "blue");
// let car2 = new Car("Honda", "Civic", "1200kg", "red");
// car1.start();

//latihan class
// class sepeda {
//     constructor(merk, warna, jumlah_gear) {
//         this.merk = merk;
//         this.warna = warna;
//         this.jumlah_gear = jumlah_gear;
//     }

//     start() {
//         console.log(`${this.merk} mulai dikayuh`);
//     }

//     brake() {
//         console.log(`${this.merk} mengerem`);
//     }
// }
// let sepeda1 = new sepeda("Polygon", "Merah", 7);
// let sepeda2 = new sepeda("United", "Biru", 21);

// sepeda1.start();
// sepeda2.brake();

//latihan lagi
class Student {
  constructor(nama, nim, jurusan, tahun) {
    this.nama = nama;
    this.nim = nim;
    this.jurusan = jurusan;
    this.tahun =- tahun;
  }

  introduce() {
    console.log(`Halo saya ${this.nama}, mahasiswa ${this.jurusan} angkatan ${this.tahun}`);
  }

  isSenior() {
    return this.tahun < 2025;
  }
}

const mhs1 = new Student("Fabian", "12345678", "Informatika", 2026);
mhs1.introduce();
console.log(mhs1.isSenior());
