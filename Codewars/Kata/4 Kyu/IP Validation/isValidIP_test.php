class ValidIpTest extends TestCase
{
    public function testValid()
    {
        $valid = [
            '0.0.0.0',
            '123.45.67.89',
            '255.255.255.255',
            '1.2.3.4',
            '31.41.59.26',
            '53.58.97.93',
            '238.46.26.43',
            '38.32.79.50',
            '28.84.197.169',
            '39.93.75.105',
            '82.0.97.49',
            '44.59.230.78',
            '164.0.62.86',
            '208.99.86.28',
            '0.34.82.53',
            '42.117.0.67',
            '98.214.80.86',
            '51.32.82.30',
            '66.47.0.93',
            '84.46.0.95',
            '50.58.22.31',
            '72.53.59.40',
            '81.28.48.1',
        ];

        foreach ($valid as $input) {
            $this->assertTrue(isValidIP($input), "Failed asserting that '$input' is a valid IP4 address.");
        }
    }

    public function testInvalid()
    {
        $invalid = [
            '',
            'abc.def.ghi.jkl',
            '123.456.789.0',
            '12.34.56',
            '256.1.2.3',
            '1.2.3.4.5',
            '123,45,67,89',
            ' 1.2.3.4',
            '1.2.3.4 ',
        ];

        foreach($invalid as $input) {
            $this->assertFalse(isValidIP($input), "Failed asserting that '$input' is an invalid IP4 address.");
        }
    }

    public function testRandom()
    {
        foreach (range(1, 3) as $_) {
            $valid = $this->getRandomValid();
            $this->assertTrue(isValidIP($valid), "Failed asserting that '$valid' is a valid IP4 address.");

            $invalid = $this->getRandomInvalid();
            $this->assertFalse(isValidIP($invalid), "Failed asserting that '$invalid' is an invalid IP4 address.");
        }
    }

    protected function getRandomValid()
    {
        return rand(0, 255).'.'.rand(0, 255).'.'.rand(0, 255).'.'.rand(0, 255);
    }

    protected function getRandomInvalid()
    {
        $chars = " @#$.*%;',";
        return $this->getRandomValid().$chars[rand(0, strlen($chars - 1))];
    }
}
