import React from 'react';
import Square from './Square';

class Board extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            squares: Array(9).fill(null),
        };
    }
    renderSquare(i) {
        //We passed the 'value' prop down from the Board to show numbers from 0 to 8 in every square.
        //prop called value is passed to Square component which is a child component
        // return <Square  value ={i}/>;

        /**
         * Board is instructing each individual Square about its current value('x','o' or null)
         */
        return (
                <Square  value ={this.state.squares[i]}
                onClick={()=>this.handleClick(i)}
        />);
    }

    handleClick(i){
        const squares = this.state.squares.slice();
        squares[i]='X';
        this.setState({squares:squares});
    }
  
    render() {
      const status = 'Next player: X';
  
      return (
        <div>
          <div className="status">{status}</div>
          <div className="board-row">
            {this.renderSquare(0)}
            {this.renderSquare(1)}
            {this.renderSquare(2)}
          </div>
          <div className="board-row">
            {this.renderSquare(3)}
            {this.renderSquare(4)}
            {this.renderSquare(5)}
          </div>
          <div className="board-row">
            {this.renderSquare(6)}
            {this.renderSquare(7)}
            {this.renderSquare(8)}
          </div>
        </div>
      );
    }
  }

export default Board;