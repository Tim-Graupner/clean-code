import { VehicleFormatter } from '../../main/typescript/VehicleFormatter';
import { NoSuchElementError } from '../../main/typescript/NoSuchElementError';

test('toHtml for non-existent vin', () => {
    expect(() => {
        let vehicle1: string = VehicleFormatter.byVin('INVALID').toHtml();
    }).toThrow(NoSuchElementError);
});

test('toHtml for vins', () => {
    let vehicle1: string = VehicleFormatter.byVin('1HGBH41JXMN109186').toHtml();
    expect(vehicle1).toBeDefined();
});

test('toMarkdown for vins', () => {
    let vehicle1: string = VehicleFormatter.byVin('1HGBH41JXMN109186').toMarkdown();
    expect(vehicle1).toBeDefined();
});