Zaimplementuj klasę NS (nazwa od Napis Skompresowany), której obiekty:
- [ ] można tworzyć zadając zawartość napisem typu String (np. ns = new NS (”aaa”)),
- [ ] potrafią podać długość pamiętanego napisu (np. ns.długość()),
- [ ] potrafią podać swoją zawartość w postaci obiektu klasy String (np. System.out.println(”napis = ” + ns)
powinno w naszym przykładzie wypisać ”napis = aaa”),
- [ ] potrafią dać znak występujący w napisie na zadanej pozycji, zakładamy że ta pozycja jest poprawna,
tzn. >= 0 i < długości pamiętanego napisu (np. znak = ns.dajZnak(2)),
- [ ] potrafią policzyć ile razy w napisie występuje podany znak (np. ns.ile(‘a’)),
- [ ] (*) potrafią zamienić znak z danej pozycji na inny, znów zakładamy że pozycja jest poprawna (np.
ns.zamień(2,’b’)). Uwaga ta operacja może spowodować zmianę (zwiększenie lub zmniejszenie)
liczby segmentów!
