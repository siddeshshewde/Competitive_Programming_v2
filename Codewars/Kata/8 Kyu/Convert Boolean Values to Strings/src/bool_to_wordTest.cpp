Describe(bool_to_word_method)
{
    It(basic_tests)
    {
        Assert::That(bool_to_word(true), Equals("Yes"));
        Assert::That(bool_to_word(false), Equals("No"));
    }
};