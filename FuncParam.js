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
let sepeda = {
    merk: "Polygon",
    warna: "Merah",
    jumlah_gear: "7",

    start : function() {
        console.log("Sepeda mulai dikayuh");
    },
    brake : function() {
        console.log("Sepeda mengerem");
    },
};

console.log(sepeda.merk);
console.log(sepeda.warna);
sepeda.start();
sepeda.brake();