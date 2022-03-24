import { Link,Outlet } from "react-router-dom";

function Home(){
    return (
        <>
            <nav>
            <ul>
                <li>
                    <Link to="/login"> Login</Link>
                </li>
                <li>
                    <Link to="/userregistration"> Register Yourself</Link>
                </li>
            </ul>
            </nav>
            <Outlet />
        </>
    );
}


export default Home;