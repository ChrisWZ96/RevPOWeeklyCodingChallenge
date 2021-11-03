function zeroesToEnd(intArray){
    let counter = 0;
    for(let i=0;i<intArray.length;i++){
        if(intArray[i] === 0){
            intArray.splice(i,1);
            counter++;
            i--;
        }
    }
    for(let j=0;j<counter;j++){
        intArray.push(0);
    }
    return intArray;
}

function shiftToRight(a,b){
    let x = Math.pow(2,b);
    return Math.floor(a/x);
}

console.log(zeroesToEnd([1, 2, 0, 0, 4, 0, 5]));
console.log(zeroesToEnd([0, 0, 2, 0, 5]));
console.log(zeroesToEnd([4, 4, 5]));
console.log(zeroesToEnd([0, 0]));
console.log(shiftToRight(80,3));
console.log(shiftToRight(-24,2));
console.log(shiftToRight(-5,1));
console.log(shiftToRight(4666,6));
console.log(shiftToRight(3777,6));
console.log(shiftToRight(-512,10));
