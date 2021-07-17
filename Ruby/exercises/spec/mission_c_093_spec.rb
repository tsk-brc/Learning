require './app/mission_c_093.rb'

describe '点数対決チェック' do
  describe '出力結果のテスト' do
    let(:missionC093) { MissionC093.new }

    it 'テスト1' do
      allow($stdin).to receive(:gets) { "75 81\n" }
      expect($stdout).to receive(:puts).with('Alice')
      missionC093.run
    end

    it 'テスト2' do
      allow($stdin).to receive(:gets) { "100 91\n" }
      expect($stdout).to receive(:puts).with('Bob')
      missionC093.run
    end

    it 'テスト3' do
      allow($stdin).to receive(:gets) { "69 87\n" }
      expect($stdout).to receive(:puts).with('Draw')
      missionC093.run
    end
  end
end
