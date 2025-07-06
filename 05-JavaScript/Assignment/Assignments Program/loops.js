//Loops
for(let i = 1; i <= 10; i++){
    console.log(i);
    
}

let i = 1;
while (i <= 10){
    console.log(i);
    i++;
}

i = 1;
do{
    console.log(i);
    i++;

}while(i <= 10);

//Nested Loops
for(let i = 1; i <= 5; i++){
    for(let j = 1; j <= 5; j++){
        console.log("i: " + i + ", j: " + j);
    }
}

//Break and Continue
for(let i = 1; i <= 5; i++){
    if(i === 3){
        break;
    }
    console.log(i);
}

for(let i = 1; i <= 5; i++){
    if(i === 3){
        continue;
    }
    console.log(i);
}