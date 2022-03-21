"use strict";
exports.__esModule = true;
var Mail = /** @class */ (function () {
    function Mail() {
    }
    Mail.prototype.later = function (email, after) {
        console.log("Send email to ".concat(email, " in ").concat(after, " ms."));
        return true;
    };
    Mail.prototype.send = function (email) {
        console.log("Sent email to ".concat(email));
        return true;
    };
    Mail.prototype.queue = function (email) {
        console.log("Queue an email to ".concat(email));
        return true;
    };
    return Mail;
}());
var mail = new Mail();
var laterMail = mail.later('abc@gmail.com', 10);
console.log(laterMail);
console.log(mail.send('def@gmail.com'));
console.log(mail.queue('ghi@gmail.com'));
