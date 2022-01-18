var moment = require("moment")

let timeDiff = moment("2022-01-25")
var duration = moment.duration(moment(moment("2022-01-25 12:00:00")).diff(new Date()))
console.log(Math.floor(duration.asHours()) + ':' + duration.minutes() + ':' + duration.seconds())

