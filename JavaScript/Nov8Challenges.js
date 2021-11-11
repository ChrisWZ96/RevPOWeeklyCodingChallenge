function trackRobot(intArray){
    let tracker = [0,0]

    if(intArray){
        for(let i=0;i<intArray.length;i++){
            if(i%4 == 0){
                tracker[1] += intArray[i];
            }
            if(i%4 == 1){
                tracker[0] += intArray[i]; 
            }
            if(i%4 == 2){
                tracker[1] -= intArray[i];
            }
            if(i%4 == 3){
                tracker[0] -= intArray[i];
            }
        } 
    }
    return tracker;
}

function vendingMachine(products,coins,id){
    if(id > products.length || id == 0) {
        return "Enter a valid product number";
    }
    id = id-1;
    if(products[id][1] > coins){
        return "Not enough money for this product";
    }
    let remainder = coins - products[id][1];
    let change = [];
    while(remainder !== 0){
        if(remainder >= 500){
            remainder = remainder-500;
            change.push(500);
            continue;
        }
        if(remainder >= 200){
            remainder = remainder-200;
            change.push(200);
            continue;
        }
        if(remainder >= 100){
            remainder = remainder-100;
            change.push(100);
            continue;
        }
        if(remainder >= 50){
            remainder = remainder-50;
            change.push(50);
            continue;
        }
        if(remainder >= 20){
            remainder = remainder-20;
            change.push(20);
            continue;
        }
        if(remainder >= 10){
            remainder = remainder-10;
            change.push(10);
            continue;
        }
    }
    return "product: \"" + products[id][0]+ "\", change: [" + change +"]";

}

let products = [["Energy Drink",300],["Soft Drink",250],["Sports Drink",350],["Water",300],["Candy Bar",220],["Chewing Gum",180],["Crackers",120]]

console.log(trackRobot([20, 30, 10, 40]));
console.log(trackRobot());
console.log(trackRobot([-10, 20, 10]));
console.log(vendingMachine(products, 200, 7));
console.log(vendingMachine(products, 500, 0));
console.log(vendingMachine(products, 90, 1));