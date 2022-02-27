var moment = require("moment")

let timeDiff = new Date("2022-02-19 22:55:00")
console.log(timeDiff)
var duration = moment.duration(moment("2022-02-19 22:55:00").diff(new Date()))
console.log(Math.floor(duration.asHours()) + ':' + duration.minutes() + ':' + duration.seconds())
console.log(duration.asMinutes())