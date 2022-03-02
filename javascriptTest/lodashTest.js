const { set } = require('lodash');
var _ = require('lodash');


const newList = [0, 1, 2, 3].filter((v, i) => {
    return i % 2 == 0;
})

console.log(newList)

let a = [1, 2, 3]


result = {}
console.log(_.isEmpty(result["ee"]))
result["efef"] = 4
console.log(result)

const myList = [1,2,3,4,5,6];
for (const [index, i] of myList.entries()) {
    console.log(index, i)
    console.log("length" + myList.length)
    if (i % 2 == 0)
        myList.pop(myList.length - 2)
}

const offer= {
    "a": {"1": "1"},
    "b": {"2": "1"},
}

delete offer["c"]
console.log(offer)