export default (state,action)=>{
    switch (action.type) {
        case "rotate":
          return { rotating: action.payload };
        default:
          // If the reducer doesn't care about this action type,
          // return the existing state unchanged
          return state;
      }
    }