Rails.application.routes.draw do
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
  root 'top#index'
  get 'about' => 'top#about', as: 'about'
  get 'bad_request' => 'top#bad_request'
  get 'forbidden' => 'top#forbidden'
  get 'internal_server_error' => 'top#internal_server_error'

  1.upto(18) do |n|
    get "lesson/step#{n}(/:name)" => "lesson#step#{n}"
  end

  resources :members, only: %i[index show] do
    get 'search', on: :collection
    resources :entries, only: [:index]
  end

  resource :session, only: %i[create destroy]
  resource :account, only: %i[show edit update]
  resource :password, only: %i[show edit update]

  resources :articles, only: %i[index show]
  resources :entries do
    patch 'like', 'unlike', on: :member
    get 'voted', on: :collection
    resources :images, controller: 'entry_images' do
      patch :move_higher, :move_lower, on: :member
    end
  end

  namespace :admin do
    root 'top#index'
    resources :members do
      get 'search', on: :collection
    end
    resources :articles
  end
end
