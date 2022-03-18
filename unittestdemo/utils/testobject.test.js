const {houseForSale,desiredHouse} = require('./testobject');

test('the house has my desired features', () => {
    expect(houseForSale).toMatchObject(desiredHouse);
  });