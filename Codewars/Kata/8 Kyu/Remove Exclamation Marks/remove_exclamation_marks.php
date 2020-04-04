function remove_exclamation_marks($string) {
   $result = "";
        for ($i = 0 ; $i < strlen($string) ; $i++)
        {
            if ($string[$i] != '!')
                $result = $result . $string[$i];
        }
        return $result;
}