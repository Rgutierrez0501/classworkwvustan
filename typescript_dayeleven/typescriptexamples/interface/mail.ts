import { FutureMailable } from "./futuremailable";

class Mail implements FutureMailable{

    later(email: string, after: number): boolean {
        console.log(`Send email to ${email} in ${after} ms.`)
        return true;
    }
    send(email: string): boolean {
        console.log(`Sent email to ${email}`)
        return true;
    }
    queue(email: string): boolean {
        console.log(`Queue an email to ${email}`)
        return true;
    }
    
}

let mail = new Mail();
let laterMail = mail.later('abc@gmail.com',10);
console.log(laterMail);
console.log(mail.send('def@gmail.com'));
console.log(mail.queue('ghi@gmail.com'));