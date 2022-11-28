package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {

    @Test
    void positionIsRight() {
        Cell cell = Cell.findBy(5, 0);
        BishopBlack bishopBlack = new BishopBlack(cell);
        Cell cellActual = bishopBlack.position();
        assertThat(cell).isEqualTo(cellActual);
    }

    @Test
    void copyRightPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.findBy(5, 0));
        Cell newCell = Cell.findBy(0, 6);
        Figure bishopBlackNew = bishopBlack.copy(newCell);
        assertThat(newCell).isEqualTo(bishopBlackNew.position());
    }

    @Test
    void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = bishopBlack.way(Cell.G5);
        Cell[] expectedSteps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps).isEqualTo(expectedSteps);
    }
}