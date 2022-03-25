import { useState } from "react"

function ParentComponent(){
    const [user,setUser]=useState('Revature');

    return(
        <>
            <h1>{`Hello ${user} !`}</h1>
            <ChildComponentOne user= {user}/>
        </>
    );
}

function ChildComponentOne({user}){

    return(
        <>
            <h2>Child Component One</h2>
            <h2>{`Hello ${user} again !`}</h2>
            </>
    );

}

function ChildComponentTwo({user}){

    return(
        <>
            <h2>Child Component Two</h2>
            <ChildComponentOne user={user} />
            </>
    );

}