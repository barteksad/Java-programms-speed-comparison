

template <typename Iter, typename Compare>
Iter partition(Iter begin, Iter end, Compare cmp)
{
    Iter pivot = std::prev(end, 1);
    Iter bound = begin;
    for(Iter j = begin; j != end; j++)
        if(cmp(*j, *pivot))
        {
            std::swap(*bound++, *j);
        }
    std::swap(*bound, *pivot);
    return bound;
}

template <typename Iter, typename Compare>
void qsort(Iter begin, Iter end, Compare cmp)
{
    if(std::distance(begin, end) > 1)
    {
        Iter bound = partition(begin, end, cmp);
        qsort(begin, bound, cmp);
        qsort(bound + 1, end, cmp);
    }
}