import { Link,Outlet } from "react-router-dom";
function UserRegistration(){
    return(
        <>
        <h1>Register yourself by filling below fields..</h1>
        <div>
            <nav>
           
                    <Link to="/"> Home</Link>
           
            </nav>
            <Outlet />
        </div>
        </>
    );
}

export default UserRegistration;