import MadeGoal from "./MadeGoal";
import MissedGoal from "./MissedGoal";

function Goal(props){
    const isGoal = props.isGoal;
    //Other than 'if' we can use logical && operator and ternary(isGoal ? <MadeGoal/>: <MissedGoal />) operator also to render differenct components on the basis of a condition 
    /**
    if(isGoal){
        return <MadeGoal />;
    }

    return <MissedGoal />; */
    
    /**
    //ternary operator
    return isGoal  ? <MadeGoal/> : <MissedGoal />;
     */
        if(isGoal && true){
            return <MadeGoal />;
        }
        return <MissedGoal />;
    
}

export default Goal;