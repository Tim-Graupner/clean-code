import { VehicleFormatter } from './VehicleFormatter';

let vehicle1 : VehicleFormatter = VehicleFormatter.byVin('1HGBH41JXMN109186');
console.log(vehicle1.toHtml());
console.log(vehicle1.toMarkdown());

console.log('Done');