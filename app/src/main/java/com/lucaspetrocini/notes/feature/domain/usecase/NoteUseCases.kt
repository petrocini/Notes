package com.lucaspetrocini.notes.feature.domain.usecase

data class NoteUseCases(
    val getAllNotes: GetAllNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNote: AddNoteUseCase,
    val getNoteById: GetNoteByIdUseCase
)
