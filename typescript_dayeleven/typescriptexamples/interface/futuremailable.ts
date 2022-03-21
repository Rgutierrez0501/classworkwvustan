import { Mailable } from "./mailable";

interface FutureMailable extends Mailable{
    later(email:string,after: number): boolean 
}

export type {FutureMailable};